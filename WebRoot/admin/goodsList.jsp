﻿<%@page language="java" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!doctype html>
<html>
<head>
    <meta charset="UTF-8">
    <title>后台管理</title>
    <link rel="stylesheet" type="text/css" href="css/common.css"/>
    <link rel="stylesheet" type="text/css" href="css/main.css"/>
    <script type="text/javascript" src="js/libs/modernizr.min.js"></script>
     <script type="text/javascript">
    function allChoose(){
     	  var allcheck=document.getElementById("allck");
    	  var idcks=document.getElementsByName("ids"); 
    	  if(allcheck.checked==true){
    		  for(var i=0;i<idcks.length;i++){
    			  idcks[i].checked=true;
    		  }
    	   }else{ 
    		   for(var i=0;i<idcks.length;i++){
     			  idcks[i].checked=false;
     		  }
    	   }
       }
    </script>
</head>
<body>
<div class="topbar-wrap white">
    <div class="topbar-inner clearfix">
        <div class="topbar-logo-wrap clearfix">
            <h1 class="topbar-logo none"><a href="index.html" class="navbar-brand">后台管理</a></h1>
            <ul class="navbar-list clearfix">
                <li><a class="on" href="main.jsp">首页</a></li>
                <li><a href=" " target="_blank">网站首页</a></li>
            </ul>
        </div>
        <div class="top-info-wrap">
            <ul class="top-info-list clearfix">
                <li><a href="#">管理员</a></li>
                <li><a href="#">修改密码</a></li>
                <li><a href="#">退出</a></li>
            </ul>
        </div>
    </div>
</div>
<div class="container clearfix">
    <div class="sidebar-wrap">
        <div class="sidebar-title">
            <h1>菜单</h1>
        </div>
        <div class="sidebar-content">
            <ul class="sidebar-list">
                <li>
                    <a href="#"><i class="icon-font">&#xe003;</i>常用操作</a>
                    <ul class="sub-menu">
                       <li><a href="userAction"><i class="icon-font">&#xe008;</i>用户管理</a></li>
                        <li><a href="goodsTypeAction"><i class="icon-font">&#xe006;</i>商品类别</a></li>
                        <li><a href="goodsAction"><i class="icon-font">&#xe005;</i>商品管理</a></li>
                        <li><a href="orderAction"><i class="icon-font">&#xe005;</i>订单管理</a></li>
                        <li><a href="adminUserAction"><i class="icon-font">&#xe005;</i>管理员管理</a></li>
                        <li><a href="design.html"><i class="icon-font">&#xe012;</i>评论管理</a></li>
                        <li><a href="design.html"><i class="icon-font">&#xe052;</i>友情链接</a></li>
                        <li><a href="design.html"><i class="icon-font">&#xe033;</i>广告管理</a></li> 
                    </ul>
                </li>
                <li>
                    <a href="#"><i class="icon-font">&#xe018;</i>系统管理</a>
                    <ul class="sub-menu">
                        <li><a href="system.html"><i class="icon-font">&#xe017;</i>系统设置</a></li>
                        <li><a href="system.html"><i class="icon-font">&#xe037;</i>清理缓存</a></li>
                        <li><a href="system.html"><i class="icon-font">&#xe046;</i>数据备份</a></li>
                        <li><a href="system.html"><i class="icon-font">&#xe045;</i>数据还原</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
    <!--/sidebar-->
    <div class="main-wrap">

        <div class="crumb-wrap">
            <div class="crumb-list"><i class="icon-font"></i><a href="main.jsp">首页</a><span class="crumb-step">&gt;</span><span class="crumb-name">商品管理</span></div>
        </div>
        <div class="search-wrap">
            <div class="search-content">
                <form action="#" method="post">
                    <table class="search-tab">
                    <!--  
                        <tr>
                            <th width="120">选择分类:</th>
                            <td>
                                <select name="search-sort" id="">
                                    <option value="">全部</option>
                                    <option value="1">服装</option>
                                    <option value="2">电器</option>
                                    <option value="3">日用品</option>
                                    <option value="4">食品</option>
                                    <option value="5">厨房用品</option>
                                    <option value="6">家具</option>
                                </select>
                            </td>
                            -->
                        <tr>
                            <th width="70">关键字:</th>
                            <td><input class="common-text" placeholder="关键字" name="keywords" value="" id="" type="text"></td>
                            <td><input class="btn btn-primary btn2" name="sub" value="查询" type="submit"></td>
                        </tr>
                        
                    </table>
                </form>
            </div>
        </div>
        <div class="result-wrap">
            <form action=" " name="myform" id="myform" method="post">
                <div class="result-title">
                    <div class="result-list">
                        <a href="goodsAction!addGoods"><i class="icon-font"></i>增加商品</a>
                        <!--  <a id="batchDel" href="javascript:void(0)"><i class="icon-font"></i>批量删除</a>
                        --> 
                        <a id="batchDel" href="javascript:allChoose()"><i class="icon-font"></i>批量删除</a> 
                    </div>
                </div>
                <div class="result-content">
                    <table class="result-tab" width="100%">
                        <tr>
                            <th class="tc" width="5%"><input class="allChoose" id="allck" type="checkbox" onclick="allChoose()"></th>
                            <th>ID</th>
                            <th>商品名称</th>
                            <th>商品描述</th>
                            <th>价格</th>
                            <th>商品类别ID</th>
							 <!-- 
                            <th>商品类别</th>
                            <th>商品图片</th> 
                            -->
                            <th>操作</th>
                        </tr>
                        <s:iterator value="page.data">
                        <tr>
                            <td class="tc"><input name="ids" value="" type="checkbox"></td>
                            <td><s:property value="goodsid"/></td>
                            <td><s:property value="goodsname"/></td>
                            <td><s:property value="goodsdesc"/></td>
                            <td><s:property value="price"/></td>
                            <td><s:property value="goodsTypees.goodsTypeId"/></td>
                             <!-- 
                            <td>aaa</td> 
                            
                            <td><img src="../" width="50px" height="50px"></td> 
                            -->
                            <td>
                                <a class="link-update" href="goodsAction!findGoodsById?goodsid=<s:property value="goodsid"/>">修改</a>
                                <a class="link-del" href="goodsAction!deleteGoodsById?goodsid=<s:property value="goodsid"/>">删除</a>
                            </td>
                        </tr> 
                         </s:iterator>
                    </table>
                    <div class="list-page"> 
                    	总共页数：<s:property value="page.totalPage"/>
                    	当前页：<s:property value="page.currentPage"/>
                    	每页显示：<s:property value="page.pageSize"/>
                    	总共的记录数：<s:property value="page.AllRow"/>
                    	<a href="goodsAction?currentPage=${currentPage-1}">上一页</a>
                    	<a href="goodsAction?currentPage=${currentPage+1}">下一页</a>
                    </div>
                </div>
            </form>
        </div>
    </div>
    <!--/main-->
</div>
</body>
</html>