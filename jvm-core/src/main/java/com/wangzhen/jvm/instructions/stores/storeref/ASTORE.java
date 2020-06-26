package com.wangzhen.jvm.instructions.stores.storeref;

import com.wangzhen.jvm.instructions.base.Index8Instruction;
import com.wangzhen.jvm.instructions.stores.Store;
import com.wangzhen.jvm.runtimeData.ZFrame;

/**
 * Author: zhangxin
 * Time: 2017/5/5 0005.
 * Desc:
 */
public class ASTORE extends Index8Instruction {
    @Override
    public void execute(ZFrame frame) {
        Store.astore(frame,index);
    }
}
