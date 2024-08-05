package org.capacitor.quasar.app;

import android.provider.Settings;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "DeviceId")
public class DeviceIdPlugin extends Plugin {
  @PluginMethod()
  public void getId(PluginCall call) {
    String androidId = Settings.Secure.getString(getContext().getApplicationContext().getContentResolver(), Settings.Secure.ANDROID_ID);

    JSObject result = new JSObject();
    result.put("id", androidId);
    call.resolve(result);
  }
}
