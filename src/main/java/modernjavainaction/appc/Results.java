package modernjavainaction.appc;

/**
 * @author sjm5858@126.com
 * @date 2021/2/28 22:08
 */
public interface Results {
    <R> R get(Object key);
}
