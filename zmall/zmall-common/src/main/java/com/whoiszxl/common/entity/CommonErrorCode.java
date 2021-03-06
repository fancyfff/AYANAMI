package com.whoiszxl.common.entity;

/**
 * 异常编码
 */
public enum CommonErrorCode implements ErrorCode {

    ////////////////////////////////////公用异常编码 //////////////////////////
    E_100101(100101,"传入参数与接口不匹配"),
    E_100102(100102,"验证码错误"),
    E_100103(100103,"验证码为空"),
    E_100104(100104,"查询结果为空"),
    E_100105(100105,"ID格式不正确或超出Long存储范围"),
    E_100106(100106,"上传错误"),
    E_100107(100107,"发送验证码错误"),
    E_100108(100108,"传入对象为空"),
    E_100109(100109,"手机号格式不正确"),
    E_100110(100110,"用户名为空"),
    E_100111(100111,"密码为空"),
    E_100112(100112,"手机号为空"),
    E_100113(100113,"手机号已存在"),
    E_100114(100114,"用户名已存在"),
    E_100115(100115,"密码不正确"),



    ////////////////////////////////////交易服务异常编码300//////////////////////////
    E_300001(300001,"支付金额为空"),
    E_300002(300002,"openId为空"),
    E_300003(300003,"appId为空"),
    E_300004(300004,"商户id为空"),
    E_300005(300005,"服务类型编码为空"),
    E_300006(300006,"订单金额转换异常"),
    E_300007(300007,"原始支付渠道为空"),
    E_300008(300008,"已存在相同的支付参数，不可重复配置"),
    E_300009(300009,"传入对象为空或者缺少必要的参数"),
    E_300010(300010,"应用没有绑定服务类型，不允许配置参数"),

    E_300110(300110,"交易单号不能为空"),


    ////////////////////////////////////支付渠道代理服务异常编码400//////////////////
    E_400001(400001,"微信确认支付失败"),
    E_400002(400002,"支付宝确认支付失败"),
    ////////////////////////////////////运营服务异常编码500//////////////////

    ////////////////////////////////////特殊异常编码/////////////////////////////////////
    E_999991(999991,"调用微服务-授权服务 被熔断"),
    E_999992(999992,"调用微服务-用户服务 被熔断"),
    E_999993(999993,"调用微服务-资源服务 被熔断"),
    E_999994(999994,"调用微服务-同步服务 被熔断"),

    E_999910(999910,"调用微服务-没有传tenantId租户Id"),
    E_999911(999911,"调用微服务-没有json-token令牌"),
    E_999912(999912,"调用微服务-json-token令牌解析有误"),
    E_999913(999913,"调用微服务-json-token令牌有误-没有当前租户信息"),
    E_999914(999914,"调用微服务-json-token令牌有误-该租户下没有权限信息"),

    E_NO_AUTHORITY(999997,"没有访问权限"),
    CUSTOM(999998,"自定义异常"),
    /**
     * 未知错误
     */
    UNKNOWN(999999,"未知错误");


    private int code;
    private String desc;

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    private CommonErrorCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }


    public static CommonErrorCode setErrorCode(int code) {
        for (CommonErrorCode errorCode : CommonErrorCode.values()) {
            if (errorCode.getCode()==code) {
                return errorCode;
            }
        }
        return null;
    }
}

