// IFetchWeatherService.aidl
package com.example.myassignment7;

// Declare any non-default types here with import statements
import com.example.myassignment7.IFetchDataListener;
interface IFetchWeatherService {
    void retrieveWeatherData();
    void registerFetchDataListener(IFetchDataListener listener);
    void unregisterFetchDataListener(IFetchDataListener listener);
}
