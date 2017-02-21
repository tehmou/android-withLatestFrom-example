package com.tehmou.book.androidwithlatestfromexercise;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.jakewharton.rxbinding2.view.RxView;
import com.jakewharton.rxbinding2.widget.RxTextView;

import io.reactivex.Observable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Observable<String> titleObservable =
                RxTextView
                        .textChanges((TextView) findViewById(R.id.title_edit_text))
                        .map(Object::toString);

        final Observable<String> messageObservable =
                RxTextView
                        .textChanges((TextView) findViewById(R.id.message_edit_text))
                        .map(Object::toString);

        final Observable<Object> clickEvents =
                RxView.clicks(findViewById(R.id.action_button));


        /**
         * Show a dialog based on the Observables
         *
         * new AlertDialog.Builder(this)
         *   .setTitle(...)
         *   .setMessage(...)
         *   .show();
        **/
    }
}
