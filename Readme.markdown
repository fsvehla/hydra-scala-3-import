## Minimized Hydra build error with Scala 3 style imports

This build will not compile when using Hydra, unless the Scala 3 style import is changed in `Scala3Styleimport.scala`

```diff
--- import java.math as jm
+++ import java.{ math => jm }
```
