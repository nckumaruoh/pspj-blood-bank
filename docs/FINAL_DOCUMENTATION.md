# Blood Bank Inventory & Donor Matcher — final documentation

## Educational scope

This is a PSPJ programming project that uses blood-group labels in a **same-group inventory simulation**. It helps students practise arrays, methods, recursion, OOP, exception handling, file operations and stream analytics. It is not clinical matching guidance, transfusion advice or clinical decision support.

## Weekly delivery map

| Week | Focus | Runnable artifact | Evidence |
| --- | --- | --- | --- |
| 1 | Project charter | `week-01/BloodBank.java` | `week-01/PROCEDURE.md`, `TRACE.md`, `OUTPUT.txt` |
| 2 | Quantity decision | `week-02/BloodRequest.java` | `week-02/PROCEDURE.md`, `TRACE.md`, `OUTPUT.txt` |
| 3 | Inventory update | `week-03/InventoryUpdate.java` | `week-03/PROCEDURE.md`, `TRACE.md`, `OUTPUT.txt` |
| 4 | Loop-driven inventory session | `week-04/BloodWeek04.java` | `week-04/PROCEDURE.md`, `TRACE.md`, `OUTPUT.txt` |
| 5 | Reusable stock methods | `week-05/BloodWeek05.java` | `week-05/PROCEDURE.md`, `TRACE.md`, `OUTPUT.txt` |
| 6 | Arrays and lookup | `week-06/BloodWeek06.java` | `week-06/PROCEDURE.md`, `TRACE.md`, `OUTPUT.txt` |
| 7 | Modular inventory desk | `week-07/BloodWeek07.java` | `week-07/PROCEDURE.md`, `TRACE.md`, `OUTPUT.txt` |
| 8 | Recursive donor search | `week-08/BloodWeek08.java` | `week-08/PROCEDURE.md`, `TRACE.md`, `OUTPUT.txt` |
| 9 | Donor registry objects | `week-09/BloodWeek09.java` | `week-09/PROCEDURE.md`, `TRACE.md`, `OUTPUT.txt` |
| 10 | Input exceptions | `week-10/BloodWeek10.java` | `week-10/PROCEDURE.md`, `TRACE.md`, `OUTPUT.txt` |
| 11 | CSV persistence | `week-11/BloodWeek11.java` | `week-11/PROCEDURE.md`, `TRACE.md`, `OUTPUT.txt` |
| 12 | Collections and streams | `week-12/BloodBank.java` | `week-12/PROCEDURE.md`, `TRACE.md`, `OUTPUT.txt` |

## Final release behaviour

The final release starts with O- (4), A+ (6) and B+ (2) units. It approves a same-group O- issue for two units, rejects an example B+ issue for four units because the required quantity is unavailable, then reports the remaining stock. A stream produces the low-stock result of `O-, B+`.

## Execution procedure

Each weekly folder is independent. Compile and run its one Java file from that folder. For the final release:

```text
cd week-12
javac BloodBank.java
java BloodBank
```

Week 11 writes and reloads `blood-inventory.csv` in its own folder. All other weeks use deterministic examples, allowing their committed `OUTPUT.txt` evidence to be reproduced exactly.

## Quality checks completed

- All twelve Java programs compile with Java 21.
- Every console result is checked against its corresponding `OUTPUT.txt` file.
- Week 7 checks a zero-unit edge case.
- Week 10 checks valid, out-of-range and non-numeric request values.
- Week 11 confirms CSV save, reload and total calculation.
- Week 12 confirms an approved issue, a held request and streams-based low-stock analytics.

## Weekly submission rule

1. Pull `main` before beginning the week's work.
2. Complete only the relevant weekly increment.
3. Compile and run it; compare its output with `OUTPUT.txt`.
4. Commit with `W##: target completed` and create the matching weekly tag.
5. Push the commit and submit the commit URL, source, procedure, trace and output evidence.
