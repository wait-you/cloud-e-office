package cn.wenhe9.yeb.server.service.impl;

import cn.wenhe9.yeb.server.domain.Position;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.wenhe9.yeb.server.service.PositionService;
import cn.wenhe9.yeb.server.mapper.PositionMapper;
import org.springframework.stereotype.Service;

/**
* @author 11623
* @description 针对表【t_position】的数据库操作Service实现
* @createDate 2022-09-24 15:16:29
*/
@Service
public class PositionServiceImpl extends ServiceImpl<PositionMapper, Position>
    implements PositionService{

}




