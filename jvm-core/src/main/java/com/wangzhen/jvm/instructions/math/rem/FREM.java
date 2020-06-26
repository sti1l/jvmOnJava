package com.wangzhen.jvm.instructions.math.rem;

import com.wangzhen.jvm.instructions.base.NoOperandsInstruction;
import com.wangzhen.jvm.runtimeData.ZFrame;
import com.wangzhen.jvm.runtimeData.OperandStack;

public class FREM extends NoOperandsInstruction {
    @Override
    public void execute(ZFrame frame) {
        OperandStack stack = frame.getOperandStack();
        float num1 = stack.popFLoat();
        float num2 = stack.popFLoat();
        float result = num2/num1;
        stack.pushFLoat(result);

    }
}
