package com.common.PagingUtil;

import java.util.List;
import java.util.Map;

/**
 * @author suyu
 */
public class PagingUtil {
    public static final Paging NO_PAGING = new Paging();

    public PagingUtil() {
    }

    public static Paging createPagingByMap(Map<?, ?> p) {
        if (p.containsKey("pageNumber") && p.containsKey("pageSize")) {
            if (Integer.parseInt(p.get("pageSize").toString()) == 0 && Integer.parseInt(p.get("pageNumber").toString()) == 0) {
                return null;
            } else {
                Paging page = new Paging();
                int pageNumber = 0;
                if (p.containsKey("pageNumber")) {
                    pageNumber = Integer.parseInt(p.get("pageNumber").toString());
                }

                int pageSize = 20;
                if (p.containsKey("pageSize") && Integer.parseInt(p.get("pageSize").toString()) != 0) {
                    pageSize = Integer.parseInt(p.get("pageSize").toString());
                }

                page.setNowPage(pageNumber + 1);
                page.setStartIndex(pageNumber * pageSize);
                page.setLoadDataCount(true);
                page.setNowPageNo(pageSize);
                return page;
            }
        } else {
            return null;
        }
    }

    public static Paging createPagingByListMap(List<Map<String, Object>> p) {
        Paging page = new Paging();
        for (Map<?, ?> item : p) {
            if (item.containsKey("pageNumber") && item.containsKey("pageSize")) {
                if (Integer.parseInt(item.get("pageSize").toString()) == 0 && Integer.parseInt(item.get("pageNumber").toString()) == 0) {
                    return null;
                } else {
                    int pageNumber = 0;
                    if (item.containsKey("pageNumber")) {
                        pageNumber = Integer.parseInt(item.get("pageNumber").toString());
                    }

                    int pageSize = 20;
                    if (item.containsKey("pageSize") && Integer.parseInt(item.get("pageSize").toString()) != 0) {
                        pageSize = Integer.parseInt(item.get("pageSize").toString());
                    }

                    page.setNowPage(pageNumber + 1);
                    page.setStartIndex(pageNumber * pageSize);
                    page.setLoadDataCount(true);
                    page.setNowPageNo(pageSize);
                    return page;
                }
            } else {
                return null;
            }
        }
        return page;
    }

    static {
        NO_PAGING.setLoadDataCount(false);
        NO_PAGING.setStartIndex(0);
        NO_PAGING.setNowPageNo(1);
    }
}
