#项目介绍

#### 特点

提供 Rest Api 风格的接口来被 H5, Android, IOS 以及第三方应用程序调用。

### 技术交流
QQ群：940577921（备注：11）
<a target="_blank" href="//shang.qq.com/wpa/qunwpa?idkey=1c0d93672d39f851223d8ca833ea764d809c3bd15000acb1052d65d89ceeb3e3"><img border="0" src="//pub.idqqimg.com/wpa/images/group.png" alt="Java互联网技术技术交流" title="Java互联网技术技术交流"></a>



#### 软件架构
![api](https://gitee.com/ym-monkey/api-gateway/raw/master/img/1.png "1.png")
![api](https://gitee.com/ym-monkey/api-gateway/raw/master/img/2.png "2.png")
![api](https://gitee.com/ym-monkey/api-gateway/raw/master/img/3.png "3.png")



#### 示例代码

1. maven依赖

```
 <dependency>
      <groupId>bat.ke.qq.com</groupId>
      <artifactId>api-gateway</artifactId>
      <version>0.0.1-SNAPSHOT</version>
    </dependency>
```

2. spring

```
<context:annotation-config />
	<bean id="apiGatewayHand" class="bat.ke.qq.com.core.ApiGatewayHand" />

	<context:annotation-config />
	<context:component-scan base-package="bat.ke.qq.com.service.**" />
```

3. java

```
@Service
public class UserServiceImpl {
    // 无缝集成
    @APIMapping(value = "api.user.getUser",useLogin = true)
    public UserInfo getUser(Long userId) {
        Assert.notNull(userId);
        UserInfo info = new UserInfo();
        info.setName("Monkey");
        info.setSex("男");
        info.setUserId(userId);
        info.setIdcard("我的QQ:2625273792");
        return info;
    }
```
3. 运行

```
http://host:port/api?method=api.user.getUser&params={%22userId%22:19}
```


#### 参与贡献

1. Monkey
2. Tommy
