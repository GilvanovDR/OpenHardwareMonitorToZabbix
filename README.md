OpenHarwareMonitorToZabbix
Утилита представляет собой микросервис для конвертации данных с OpenHardwareMonitor (https://github.com/openhardwaremonitor/openhardwaremonitor) в Zabbix (https://github.com/zabbix/zabbix) для windows систем
Предыстория: В старых версиях монитора использовалась утилита OpenHardwareMonitorReport с последующим парсином до конкретного значения и перехватом Zabbix Agent, но в последних версиях эта утилита работать перестала. Однако появилась возможность отслеживать данные в web интерфейсе и получать данные в виде JSON (http://host:port/data.json). 
Данная утилита призвана спарсить json данные в Zabbix. 
Алгоритм: Zabbix по средствам http получается запрос на определенные данный через URI(http://UtilityHost:port/IP/metric ip- сервер данных монитора, metric – необходимый параметр, UtilityHost:port адрес и порт утилиты), Утилита получает JSON объект с запрашиваемого хоста, мапит в граф объектов. Проходит по графу в поиске нужного элемента и выдает посредство полученное знамение http ответом. 

The utility works like a microservice. It receives data from OpenHardwareMonitor(https://github.com/openhardwaremonitor/openhardwaremonitor)  and converts data for Zabbix(https://github.com/zabbix/zabbix). 

Algorithm: Utility via http receives a request (http: // utillHost: port / IP / metric) from Zabbix. Then it receives a JSON object from the requested host, converts it into a graph of objects. Searches for the requested value and returns the medium received back to Zabbix.
