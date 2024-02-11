# Add any ProGuard configurations specific to this
# extension here.

-keep public class com.brandonang.compoundinterest.CompoundInterest {
    public *;
 }
-keeppackagenames gnu.kawa**, gnu.expr**

-optimizationpasses 4
-allowaccessmodification
-mergeinterfacesaggressively

-repackageclasses 'com/brandonang/compoundinterest/repack'
-flattenpackagehierarchy
-dontpreverify
