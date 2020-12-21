/**
* Copyright (c) Facebook, Inc. and its affiliates.
*
* This source code is licensed under the MIT license found in the
* LICENSE file in the root directory of this source tree.
*
* @generated by codegen project: GeneratePropsJavaDelegate.js
*/

package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.uimanager.LayoutShadowNode;

public class DatePickerManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & DatePickerManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
  public DatePickerManagerDelegate(U viewManager) {
    super(viewManager);
  }
  @Override
  public void setProperty(T view, String propName, @Nullable Object value) {
    switch (propName) {
      case "date":
        mViewManager.setDate(view, value == null ? 0f : ((Double) value).floatValue());
        break;
      case "initialDate":
        mViewManager.setInitialDate(view, value == null ? 0f : ((Double) value).floatValue());
        break;
      case "locale":
        mViewManager.setLocale(view, value == null ? null : (String) value);
        break;
      case "maximumDate":
        mViewManager.setMaximumDate(view, value == null ? 0f : ((Double) value).floatValue());
        break;
      case "minimumDate":
        mViewManager.setMinimumDate(view, value == null ? 0f : ((Double) value).floatValue());
        break;
      case "minuteInterval":
        mViewManager.setMinuteInterval(view, value == null ? 1 : ((Double) value).intValue());
        break;
      case "mode":
        mViewManager.setMode(view, (String) value);
        break;
      case "timeZoneOffsetInMinutes":
        mViewManager.setTimeZoneOffsetInMinutes(view, value == null ? 0f : ((Double) value).floatValue());
        break;
      default:
        super.setProperty(view, propName, value);
    }
  }

  public void receiveCommand(DatePickerManagerInterface<T> viewManager, T view, String commandName, ReadableArray args) {
    switch (commandName) {
      case "setNativeDate":
        viewManager.setNativeDate(view, (float) args.getDouble(0));
        break;
    }
  }
}