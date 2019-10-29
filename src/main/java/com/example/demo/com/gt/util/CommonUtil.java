package com.example.demo.com.gt.util;



import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2019/9/24.
 */
public class CommonUtil {

    /**
     * 返回json数据到客户端
     * @param response
     * @param obj
     * @throws IOException
     */
    public static void write(HttpServletResponse response, Object obj) throws IOException {
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String result = "";
        if (obj instanceof List || obj instanceof Object[]) {
            result = JSONArray.toJSONStringWithDateFormat(obj, "yyyy-MM-dd HH:mm:ss");

        }else{
            result = JSON.toJSONStringWithDateFormat(obj, "yyyy-MM-dd HH:mm:ss");
        }
        response.getWriter().print(result);
        response.getWriter().flush();
        response.getWriter().close();
    }

}
