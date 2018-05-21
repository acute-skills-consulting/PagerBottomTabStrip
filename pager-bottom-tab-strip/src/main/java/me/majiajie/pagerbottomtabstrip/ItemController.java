package me.majiajie.pagerbottomtabstrip;


import me.majiajie.pagerbottomtabstrip.listener.OnTabItemSelectedListener;

public interface ItemController {

    /**
     * 设置选中项
     *
     * @param index 顺序索引
     */
    void setSelect(int index);

    /**
     * 设置选中项，并可以控制是否回调监听事件
     *
     * @param index     顺序索引
     * @param listener  true:假如存在监听事件{@link OnTabItemSelectedListener}，就会调用相关的回调方法。false:不会触发监听事件
     */
    void setSelect(int index,boolean listener);

    /**
     * 设置导航按钮上显示的圆形消息数字，通过顺序索引。
     *
     * @param index  顺序索引
     * @param number 消息数字
     */
    void setMessageNumber(int index, int number);

    /**
     * 设置显示无数字的消息小原点
     *
     * @param index      顺序索引
     * @param hasMessage true显示
     */
    void setHasMessage(int index, boolean hasMessage);

    /**
     * 导航栏按钮点击监听
     *
     * @param listener {@link OnTabItemSelectedListener}
     */
    void addTabItemSelectedListener(OnTabItemSelectedListener listener);

    /**
     * 获取当前选中项索引
     *
     * @return 索引
     */
    int getSelected();

    /**
     * 获取导航按钮总数
     *
     * @return 总数
     */
    int getItemCount();

    /**
     * 获取导航按钮文字
     *
     * @param index 顺序索引
     * @return 文字
     */
    String getItemTitle(int index);

}
