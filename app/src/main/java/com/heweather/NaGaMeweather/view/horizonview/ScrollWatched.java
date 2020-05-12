package com.heweather.NaGaMeweather.view.horizonview;



public interface ScrollWatched {
    void addWatcher(ScrollWatcher watcher);
    void removeWatcher(ScrollWatcher watcher);
    void notifyWatcher(int x);
}
