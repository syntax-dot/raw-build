package org.capacitor.quasar.app;

import android.os.Bundle;

import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {
  @Override
  public void onCreate(Bundle savedInstanceState) {
    registerPlugin(DeviceIdPlugin.class);
    super.onCreate(savedInstanceState);
  }}
