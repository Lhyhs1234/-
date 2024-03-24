package com.didispace.chapter.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.didispace.chapter.domain.User;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {
    Page<User> findPage(Page<User>page);
    User getUserByID(Long id);
    void deleteByID(Long id);
}
