package bat.ke.qq.com.core;

/**
 * Created by 源码学院-monkey on 2018/10/26.
 */
public interface TokenService {

    public Token createToken();

    public Token getToken(String token);
}
