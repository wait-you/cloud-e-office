package cn.wenhe9.yeb.server.service.impl;

import cn.wenhe9.yeb.server.domain.Nation;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.wenhe9.yeb.server.service.NationService;
import cn.wenhe9.yeb.server.mapper.NationMapper;
import org.springframework.stereotype.Service;

/**
* @author 11623
* @description 针对表【t_nation】的数据库操作Service实现
* @createDate 2022-09-24 15:16:29
*/
@Service
public class NationServiceImpl extends ServiceImpl<NationMapper, Nation>
    implements NationService{

}




