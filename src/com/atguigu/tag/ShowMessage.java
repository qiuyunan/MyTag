package com.atguigu.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class ShowMessage extends SimpleTagSupport{
	
	@Override
	public void doTag() throws JspException, IOException {
		
		//在页面上输出一句话
		String message = "Hello DIY Tag";
		
		//获取PageContext对象
		PageContext pageContext = (PageContext) getJspContext();
		
		//通过pageContext对象获取out输出流对象
		JspWriter out = pageContext.getOut();
		
		//通过out对象向页面上输出数据
		out.print(message);
		
	}

}
