package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UsersController {
    public static List<UserV2> users = new ArrayList<UserV2>(Arrays.asList(
        new UserV2(1, "Usuario 1", "en-US"),
        new UserV2(2, "Usuario 2", "es-ES"),
        new UserV2(3, "Usuario 3", "en-US"),
        new UserV2(4, "Usuario 4", "es-ES"),
        new UserV2(5, "Usuario 5", "en-US"),
        new UserV2(6, "Usuario 6", "es-ES")
    ));
}
