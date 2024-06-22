package org.pseudo.code.facade;

import java.util.Date;

public interface CleaningService {
    void clean(int roomNumber);
    void scheduleCleaning(int roomNumber, Date endDate);
}
