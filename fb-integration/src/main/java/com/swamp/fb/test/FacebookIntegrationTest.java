package com.swamp.fb.test;

import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import facebook4j.Post;
import facebook4j.ResponseList;
import facebook4j.auth.AccessToken;

/**
 * Hello world!
 *
 */
public class FacebookIntegrationTest {
	public static void main(String[] args) throws FacebookException {
		Facebook facebook = new FacebookFactory().getInstance();

		facebook.setOAuthAppId("", "");
		// facebook.setOAuthPermissions(commaSeparetedPermissions);
		facebook.setOAuthAccessToken(new AccessToken(
				"EAACEdEose0cBAH6nXwtDbhtkGvprCbxkl6QQGv980DxYD4pURSYOCBOgOUUi4gNhUKMVrefaOuQ8mDMaMN3bN5rWZCDHdcpBHPpqYBFUYEZAUmI1ZAOkKrziblRnk1vVCQx4oiBZCyTEbDknOIG7BXsoW4XFVFmeWJWAW7v4ZCA68kxswEaZAM35hyCYegZB2gZD"));

		facebook.getOAuthAccessToken();
		ResponseList<Post> posts = facebook.getPosts();
		
		for (Post post : posts) {
			System.out.println(post);
		}
	}
}
