package com.tehmou.book.androidwithlatestfromexercise;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.jakewharton.rxbinding.view.RxView;
import com.jakewharton.rxbinding.widget.RxTextView;

import rx.Observable;

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

        final Observable<Void> clickEvents =
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
