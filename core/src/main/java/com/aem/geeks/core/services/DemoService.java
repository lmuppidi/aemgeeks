package com.aem.geeks.core.services;

import com.day.cq.wcm.api.Page;

import java.util.Iterator;
/** Returns Pages**/

public interface DemoService {
    public Iterator<Page> getPages();
}
