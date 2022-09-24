package cn.wenhe9.yeb.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.wenhe9.yeb.server.service.MailLogService;
import cn.wenhe9.yeb.server.mapper.MailLogMapper;
import org.springframework.stereotype.Service;

/**
* @author 11623
* @description 针对表【t_mail_log】的数据库操作Service实现
* @createDate 2022-09-24 15:16:29
*/
@Service
public class MailLogServiceImpl extends ServiceImpl<MailLogMapper, MailLog>
    implements MailLogService{

}



