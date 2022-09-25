package cn.wenhe9.yeb.server.service.impl;

import cn.wenhe9.yeb.server.domain.Salary;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.wenhe9.yeb.server.service.SalaryService;
import cn.wenhe9.yeb.server.mapper.SalaryMapper;
import org.springframework.stereotype.Service;

/**
* @author 11623
* @description 针对表【t_salary】的数据库操作Service实现
* @createDate 2022-09-24 15:16:29
*/
@Service
public class SalaryServiceImpl extends ServiceImpl<SalaryMapper, Salary>
    implements SalaryService{

}




