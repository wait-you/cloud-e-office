package cn.wenhe9.yeb.server.service.impl;

import cn.wenhe9.yeb.server.domain.Admin;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.wenhe9.yeb.server.service.AdminService;
import cn.wenhe9.yeb.server.mapper.AdminMapper;
import org.springframework.stereotype.Service;

/**
* @author 11623
* @description 针对表【t_admin(用户信息)】的数据库操作Service实现
* @createDate 2022-09-24 15:16:29
*/
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin>
    implements AdminService{

}




