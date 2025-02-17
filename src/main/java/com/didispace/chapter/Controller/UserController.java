package com.didispace.chapter.Controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.didispace.chapter.Mapper.UserMapper;
import com.didispace.chapter.Service.BookService;
import com.didispace.chapter.Service.UserService;
import com.didispace.chapter.domain.Book;
import com.didispace.chapter.domain.User;
import com.didispace.chapter.vo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Api(tags = "用户管理")
@RestController
@RequestMapping(value = "/users")     // 通过这里配置使下面的映射都在/users下
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    UserMapper userMapper;
    @Autowired
    BookService bookService;

    @GetMapping("/list")
    @ApiOperation(value = "获取用户列表")
    public Result getUserList(@RequestParam(defaultValue = "1")Integer pageNum,@RequestParam(defaultValue = "10")Integer pageSize) {
        //List datalist=userService.list();
        Page<User> userPage= userMapper.findPage(new Page<>(pageNum,pageSize));
        return Result.success(userPage);
    }

    @PostMapping("/add")
    @ApiOperation(value = "创建用户", notes = "根据User对象创建用户")
    public Result AddUser(@RequestBody User user) {
        userService.save(user);
        List<Book> booklist=user.getBookList();
        for(Book book : booklist){
            bookService.save(book);
        }
        return Result.success();
    }

    @GetMapping("/get/{id}")
    @ApiOperation(value = "获取用户详细信息", notes = "根据url的id来获取用户详细信息")
    public Result getUserByid(@PathVariable Long id) {
        User user=userMapper.getUserByID(id);
        return Result.success(user);
    }

    @PutMapping("/edit/{id}")
    @ApiImplicitParam(paramType = "path", dataType = "Long", name = "id", value = "用户编号", required = true, example = "1")
    @ApiOperation(value = "更新用户详细信息", notes = "根据url的id来指定更新对象，并根据传过来的user信息来更新用户详细信息")
    public Result EditUser(@PathVariable Long id, @RequestBody User user) {
        userMapper.deleteByID(id);
        user.setId(id);
        return AddUser(user);
       }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "删除用户", notes = "根据url的id来指定删除对象")
    public Result deleteUser(@PathVariable Long id) {
        userMapper.deleteByID(id);
        return Result.success();
    }

}