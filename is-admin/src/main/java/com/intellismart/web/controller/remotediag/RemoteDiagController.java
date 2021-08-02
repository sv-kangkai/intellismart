package com.intellismart.web.controller.remotediag;

import com.intellismart.common.core.controller.BaseController;
import com.intellismart.common.core.domain.entity.SysRole;
import com.intellismart.common.core.page.TableDataInfo;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/remotediag/remotediag")
public class RemoteDiagController extends BaseController {
    private String prefix = "remotediag/remotediag";

//    @RequiresPermissions("remotediag:remotediag:list")
//    @PostMapping("/list")
//    @ResponseBody
//    public TableDataInfo list(SysRole role) {
//        startPage();
//        List<String> list = new ArrayList<String>();
//        list.add("TEST1");
//        list.add("TEST2");
//        list.add("TEST3");
//        list.add("TEST4");
//        list.add("TEST5");
//        return getDataTable(list);
//    }

    @RequiresPermissions("remotediag:remotediag:view")
    @GetMapping()
    public String remotediag() {
        return prefix;
    }
}
