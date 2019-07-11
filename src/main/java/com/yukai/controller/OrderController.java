package com.yukai.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yukai.beans.PageQuery;
import com.yukai.beans.PageResult;
import com.yukai.model.MesOrder;
import com.yukai.param.SearchOrderParam;
import com.yukai.common.JsonData;
import com.yukai.param.MesOrderVo;
import com.yukai.service.OrderService;

///order/orderBatch.page
@Controller
@RequestMapping("/order")
public class OrderController {
	
	private static String FPATH="order/";
	@Resource
	private OrderService orderService;
	@RequestMapping("/orderBatch.page")
	public String orderBatchPage() {
		return FPATH+"orderBatch";
	}
	//Ìí¼ÓÊý¾Ý
	@ResponseBody
	@RequestMapping("/insert.json")
	public JsonData insetAjax(MesOrderVo mesOrderVo) {
		orderService.orderBatchInserts(mesOrderVo);
		return JsonData.success();
	}
	@RequestMapping("/order.json")
    @ResponseBody
    public JsonData searchPage(SearchOrderParam param, PageQuery page) {
    	PageResult<MesOrder> pr=(PageResult<MesOrder>) orderService.searchPageList(param, page);
    	return JsonData.success(pr);
    }
	
}
