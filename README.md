"# JavaPrograms" 

Data Hiding 

Abstracrtion : showing essential details without showing the background details is called abstraction.

In order to achieve abstraction in java we have two technique

1) abstract class with abstract method (Partial Abstraction)

2) interface (Complete Abstraction)

interface Client
{
    void onlineTransaction();

    void databaseTransaction();

    void onlineSecurity();
}