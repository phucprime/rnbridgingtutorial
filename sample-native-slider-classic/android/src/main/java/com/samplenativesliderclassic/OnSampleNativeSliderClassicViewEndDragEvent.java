package com.samplenativesliderclassic;

import androidx.annotation.Nullable;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;

public class OnSampleNativeSliderClassicViewEndDragEvent extends Event<OnSampleNativeSliderClassicViewEndDragEvent> {
  private final double leftKnobValue;
  private final double rightKnobValue;
  private static final String LEFT_KNOB_KEY = "leftKnobValue";
  private static final String RIGHT_KNOB_KEY = "rightKnobValue";

  public static final String NAME = "topSampleNativeSliderClassicViewEndDrag";
  public static final String EVENT_PROP_NAME = "onSampleNativeSliderClassicViewEndDrag";

  public OnSampleNativeSliderClassicViewEndDragEvent(
    int surfaceId,
    int viewId,
    double leftKnobValue,
    double rightKnobValue
  ) {
    super(surfaceId, viewId);
    this.leftKnobValue = leftKnobValue;
    this.rightKnobValue = rightKnobValue;
  }

  @Override
  public String getEventName() {
    return NAME;
  }

  @Nullable
  @Override
  public WritableMap getEventData() {
    return createPayload();
  }

  private WritableMap createPayload() {
    WritableMap payload = Arguments.createMap();
    payload.putDouble(LEFT_KNOB_KEY, leftKnobValue);
    payload.putDouble(RIGHT_KNOB_KEY, rightKnobValue);
    return payload;
  }
}