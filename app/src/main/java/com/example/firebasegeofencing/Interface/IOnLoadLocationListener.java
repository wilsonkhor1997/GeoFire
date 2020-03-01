package com.example.firebasegeofencing.Interface;

import com.example.firebasegeofencing.MyLatLng;
import com.google.android.gms.maps.model.LatLng;

import java.util.List;

public interface IOnLoadLocationListener {
    void OnLoadLocationSuccess (List<MyLatLng> latLngs);
    void OnLoadLocationFailed(String Message);
}
