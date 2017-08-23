package com.taotao.controller;

import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/")
public class ItemController {
    @Autowired
    private TbItemMapper tbItemMapper;

    @RequestMapping(value = "/item/detail/{itemId}")
    @ResponseBody
    TbItem itemDttail(@PathVariable Long itemId){
        TbItem item = tbItemMapper.selectByPrimaryKey(itemId);
        return item;
    }
}
