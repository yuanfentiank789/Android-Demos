package com.lan;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView;

/**  
 * 鐗堟潈锛� 鏋佹櫤缃戠粶鎶�湳
 * @author lanhm  
 * @version 鍒涘缓鏃堕棿锛�013-7-2 涓嬪崍12:56:12  
 * 绫昏鏄� 
 */
public class RotateTextView extends TextView{

    
    public RotateTextView(Context context) {
        super(context);
    }
    
    public RotateTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        //鍊炬枩搴�5,涓婁笅宸﹀彸灞呬腑
        canvas.rotate(45, getMeasuredWidth()/3, getMeasuredHeight()/3);
        super.onDraw(canvas);
    }
	
}
