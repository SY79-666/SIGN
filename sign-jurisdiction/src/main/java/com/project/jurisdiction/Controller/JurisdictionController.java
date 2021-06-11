package com.project.jurisdiction.Controller;

import com.project.jurisdiction.Service.Impl.JurisdictionServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Map;

@Controller
@RequestMapping("/jurisdiction")
public class JurisdictionController {
    @Autowired
    private JurisdictionServiceImpl jurisdictionService;

//    @ApiOperation(value = "普通用户升级为管理员",notes = "普通用户升级为管理员")
//    @PostMapping("/levelUp")
//    public String upgradeController(Map<String, Object> map) {
//        if (map.get("role") == "普通员工") {
//            jurisdictionService.upgradeService(Integer.parseInt(String.valueOf(map.get("phone"))),
//                    String.valueOf(map.get("id")));
//            return "用户" + map.get("name") + "已添加为管理员";
//        }
//        {
//            return "该用户已为管理员";
//        }
//    }
//
//    @ApiOperation(value = "管理员降级为普通用户" , notes = "管理员降级为普通用户")
//    @PostMapping("/levelDown")
//    public String levelDownController(Map<String,Object> map) {
//        if (map.get("role") == "管理员") {
//            jurisdictionService.demotionService(Integer.parseInt(String.valueOf(map.get("phone"))),
//                    String.valueOf(map.get("id")));
//            return "管理员" + map.get("name") + "已降级为普通用户";
//        }
//        {
//            return "该用户已为普通用户";
//        }
//    }
}
