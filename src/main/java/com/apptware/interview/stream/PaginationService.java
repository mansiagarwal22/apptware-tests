package com.apptware.interview.stream;

import java.util.List;

public interface PaginationService {

  int FULL_DATA_SIZE = 10000;
  int PAGE_SIZE = 100;

  List<String> getPaginatedData(int page, int pageSize);
}
