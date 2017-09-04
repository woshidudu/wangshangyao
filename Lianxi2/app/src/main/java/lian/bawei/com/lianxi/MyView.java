package lian.bawei.com.lianxi;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Administrator on 2017/9/2.
 */
public class MyView extends View {

    private float cy = 20;
    private float cx = 20;

    public MyView(Context context) {
        super(context);
        init(context,null);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context,null);
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context,null);
    }
    private void init(Context c, AttributeSet a) {
        if(a!= null) {
            TypedArray t = c.obtainStyledAttributes(a, R.styleable.MyView);
            boolean b = t.getBoolean(R.styleable.MyView_ba,true);
            int r = t.getResourceId(R.styleable.MyView_bg, Color.BLUE);
            setBackgroundColor(r);

            t.recycle();
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        //paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(cx,cy,15,paint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        cy = event.getY();
        cx = event.getX();
        invalidate();
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                break;
            case MotionEvent.ACTION_UP:
                break;
            case MotionEvent.ACTION_MOVE:
                break;
        }
        return true;
    }
}
