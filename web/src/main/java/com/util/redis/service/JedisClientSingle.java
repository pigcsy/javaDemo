package com.util.redis.service;


/**
 * 单机版jedis
 * 参考博文:http://www.jianshu.com/p/da69edda2a43
 * http://www.jianshu.com/p/c3b8180af944
 *
 * @author Niu Li
 * @date 2016/12/8
 */
public class JedisClientSingle implements JedisClient {
    /**
     * 根据key值获取
     *
     * @param key 指定key
     * @return 存在返回值, 不存在返回null
     */
    @Override
    public String get(String key) {
        return null;
    }

    /**
     * 设置值(String kei)
     *
     * @param key   key值
     * @param value 内容
     * @return 成功则 ok
     */
    @Override
    public String set(String key, String value) {
        return null;
    }

    /**
     * 得到key的剩余时间
     *
     * @param key 指定key
     * @return -2不存在 -1存在但无剩余时间 其他为剩余时间
     */
    @Override
    public Long ttl(String key) {
        return null;
    }

    /**
     * 等价于 set + expire
     *
     * @param key     设置的key
     * @param value   对应值
     * @param seconds 存活时间,到期自动删除
     * @return 结果
     */
    @Override
    public String setex(String key, String value, int seconds) {
        return null;
    }

    /**
     * 删除指定key
     *
     * @param key 指定key
     * @return 不存在返回0 返回删除个数
     */
    @Override
    public Long del(String key) {
        return null;
    }

    /**
     * 给指定key设置时间
     *
     * @param key     指定key
     * @param timeout 超时时间,单位秒
     * @return 1成功 0失败
     */
    @Override
    public Long expire(String key, int timeout) {
        return null;
    }

    /**
     * 检测key是否存在
     *
     * @param key 指定key
     * @return true存在
     */
    @Override
    public Boolean exists(String key) {
        return null;
    }

    /**
     * 不存在则设置,并延时,存在则什么都不做
     *
     * @param key     key值
     * @param value   值
     * @param seconds 超时时间
     * @return true成功
     */
    @Override
    public Boolean setNxAndExpire(String key, String value, int seconds) {
        return null;
    }
    // /**
    //  * 连接池,建议使用其他工具注入进来
    //  * 如果不能注入的话,可以使用构造方法初始化
    //  */
    // private final JedisPool jedisPool;
    //
    // public JedisClientSingle(JedisPool jedisPool) {
    //     this.jedisPool = jedisPool;
    // }
    //
    // public String get(final String key) {
    //     return excute(new WorkCallback<String, Jedis>() {
    //         @Override
    //         public String doWorkCallback(Jedis jedis) {
    //             return jedis.get(key);
    //         }
    //     });
    // }
    //
    // public String set(final String key, final String value) {
    //     return excute(new WorkCallback<String, Jedis>() {
    //         @Override
    //         public String doWorkCallback(Jedis jedis) {
    //             return jedis.set(key,value);
    //         }
    //     });
    // }
    //
    // public Long ttl(final String key) {
    //     return excute(new WorkCallback<Long, Jedis>() {
    //         @Override
    //         public Long doWorkCallback(Jedis jedis) {
    //             return jedis.ttl(key);
    //         }
    //     });
    // }
    //
    // public String setex(final String key, final String value, final int seconds) {
    //     return excute(new WorkCallback<String, Jedis>() {
    //         @Override
    //         public String doWorkCallback(Jedis jedis) {
    //             return jedis.setex(key,seconds,value);
    //         }
    //     });
    // }
    // public Long del(final String key) {
    //     return excute(new WorkCallback<Long, Jedis>() {
    //         @Override
    //         public Long doWorkCallback(Jedis jedis) {
    //             return jedis.del(key);
    //         }
    //     });
    // }
    //
    // public Long expire(final String key, final int timeout) {
    //     return excute(new WorkCallback<Long, Jedis>() {
    //         @Override
    //         public Long doWorkCallback(Jedis jedis) {
    //             return jedis.expire(key,timeout);
    //         }
    //     });
    // }
    //
    // public Boolean exists(final String key) {
    //     return excute(new WorkCallback<Boolean, Jedis>() {
    //         @Override
    //         public Boolean doWorkCallback(Jedis jedis) {
    //             return excute(new WorkCallback<Boolean, Jedis>() {
    //                 public Boolean doWorkCallback(Jedis jedis) {
    //                     return jedis.exists(key);
    //                 }
    //             });
    //         }
    //     });
    // }
    //
    // public Boolean setNxAndExpire(final String key, final String value, final int seconds) {
    //     return excute(new WorkCallback<Boolean, Jedis>() {
    //         @Override
    //         public Boolean doWorkCallback(Jedis jedis) {
    //             Long result = jedis.setnx(key,value);
    //             return result == 1L && jedis.expire(key, seconds) > 0;
    //         }
    //     });
    // }
    //
    // /**
    //  * 通用模板方法,很适合提取公共操作
    //  * @param workCallback 处理函数
    //  * @param <T> 返回类型
    //  * @return 结果
    //  */
    // private <T> T excute(WorkCallback<T, Jedis> workCallback) {
    //     Jedis jedis=null;
    //     try {
    //         jedis = jedisPool.getResource();
    //         return workCallback.doWorkCallback(jedis);
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //     }finally {
    //         if (null !=jedis){
    //             jedis.close();
    //         }
    //     }
    //     return null;
    // }
    //

}
