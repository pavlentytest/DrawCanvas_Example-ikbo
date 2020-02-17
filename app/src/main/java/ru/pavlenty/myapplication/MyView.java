package ru.pavlenty.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

public class MyView extends View {

    public MyView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        //super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(10);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawColor(Color.YELLOW);
        canvas.drawCircle(200,200,100,paint);
        paint.setColor(Color.GREEN);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(400,400,800,800,paint);
        //paint.setText
        // canvas.drawText()
        Path path = new Path();
        path.moveTo(500,200);
        path.lineTo(600,400);
        //canvas.rotate();
        /// .....
        canvas.drawPath(path,paint);
    }
}
