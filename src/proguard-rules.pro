# Add any ProGuard configurations specific to this
# extension here.

-keep public class com.brandonang.malabonday.malabonday\.MalabonDay\ {
    public *;
 }
-keeppackagenames gnu.kawa**, gnu.expr**

-optimizationpasses 4
-allowaccessmodification
-mergeinterfacesaggressively

-repackageclasses 'com/brandonang/malabonday/malabonday\/repack'
-flattenpackagehierarchy
-dontpreverify
