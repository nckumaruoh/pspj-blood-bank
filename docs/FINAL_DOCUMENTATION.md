# Final Documentation — Blood Bank Inventory & Donor Matcher

## Objective

Maintain blood-group stock and prevent an issue transaction when adequate units are unavailable.

## Procedure

1. Add valid stock units by blood group.
2. Look up the requested blood group before issuing units.
3. Reject a request for zero/negative units or more units than available.
4. Deduct successful issues from stock.
5. Print the remaining inventory report.

## Test trace

| Scenario | Expected | Result |
|---|---|---|
| Issue O- x2 from four units | Accepted | Passed |
| Issue B+ x4 from two units | Rejected | Passed |
| Report remaining stock | Correct counts | Passed |

## Checklist

- [x] Twelve weekly milestones
- [x] Runnable final Java release
- [x] Stock validation and issue test
- [x] Procedure, test trace and output evidence
