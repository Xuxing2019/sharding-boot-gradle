package top.xuxing.sharding.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import top.xuxing.sharding.entity.StudioTaskOrder;
import top.xuxing.sharding.service.IStudioTaskOrderService;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 工作室任务订单 前端控制器
 * </p>
 *
 * @author xhb
 * @since 2021-04-01
 */
@Controller
@RequestMapping("/studio/task/order")
public class StudioTaskOrderController {

    @Resource
    private IStudioTaskOrderService studioTaskOrderService;

    @GetMapping
    public ResponseEntity<List<StudioTaskOrder>> list(){
        return ResponseEntity.ok(studioTaskOrderService.list());
    }

    @PostMapping
    public ResponseEntity<String> put(@RequestParam long id){
        StudioTaskOrder studioTaskOrder = new StudioTaskOrder();
        studioTaskOrder.setId(id);
        studioTaskOrder.setPlatform("douyin");
        studioTaskOrder.setType("good");
        studioTaskOrderService.save(studioTaskOrder);
        return ResponseEntity.ok("ok");
    }
}
