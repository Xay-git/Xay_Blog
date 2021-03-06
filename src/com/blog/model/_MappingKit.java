package com.blog.model;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;

/**
 * Generated by JFinal, do not modify this file.
 * <pre>
 * Example:
 * public void configPlugin(Plugins me) {
 *     ActiveRecordPlugin arp = new ActiveRecordPlugin(...);
 *     _MappingKit.mapping(arp);
 *     me.add(arp);
 * }
 * </pre>
 */
public class _MappingKit {

	public static void mapping(ActiveRecordPlugin arp) {
		arp.addMapping("x_admindev", "d_id", XAdmindev.class);
		arp.addMapping("x_article", "a_id", XArticle.class);
		arp.addMapping("x_dev", "d_id", XDev.class);
		arp.addMapping("x_friendlylink", "x_linkId", XFriendlylink.class);
		arp.addMapping("x_message", "m_id", XMessage.class);
		arp.addMapping("x_message1", "m_id", XMessage1.class);
		arp.addMapping("x_resource", "r_id", XResource.class);
		arp.addMapping("x_test", "id", XTest.class);
		arp.addMapping("x_tips", "t_id", XTips.class);
		arp.addMapping("x_typenav", "t_id", XTypenav.class);
		arp.addMapping("x_user", "x_id", XUser.class);
		arp.addMapping("x_userinfo", "i_id", XUserinfo.class);
	}
}

