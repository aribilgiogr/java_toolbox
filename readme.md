# Kimlik Kontrolü Programı

## Açıklama
Bu program, kullanıcıdan bir Türkiye Cumhuriyeti Kimlik Numarası (TCKN) alarak, bu kimlik numarasının geçerli olup olmadığını kontrol eder. Kontrol, TCKN'nin doğrulama algoritmasına uygunluğunu kontrol etmek için yapılır.

## Çalışma Prensibi
1. **Kimlik Numarası Girişi**: Kullanıcıdan 11 haneli bir TCKN girmesi istenir.
2. **Geçerlilik Kontrolü**: Girilen kimlik numarasının uzunluğunun 11 hane olup olmadığı kontrol edilir.
3. **Doğrulama Hesaplamaları**:
   - Kimlik numarasının ilk 9 hanesi alınır.
   - Bu 9 haneden tek ve çift basamakların toplamları ayrı ayrı hesaplanır.
   - 10. basamak, `(tek basamaklar toplamı * 7 - çift basamaklar toplamı) % 10` formülü ile hesaplanır.
   - 11. basamak, `(tek basamaklar toplamı + çift basamaklar toplamı + 10. basamak) % 10` formülü ile hesaplanır.
4. **Sonuç Kontrolü**:
   - Hesaplanan 10. ve 11. basamak değerleri, girilen kimlik numarasının son iki basamağı ile karşılaştırılır.
   - Eğer hesaplanan ve girilen değerler uyuşuyorsa kimlik numarası "Tutarlı" olarak işaretlenir, aksi halde "Tutarsız" olarak belirtilir.

## Kullanım Talimatları
1. Programın çalıştırılması için Java'nın yüklü olduğu bir ortamda çalıştırılması gereklidir.
2. Programı başlattıktan sonra konsolda "Kimlik Giriniz:" mesajı görüntülenecektir.
3. Geçerli bir TCKN girin ve **Enter** tuşuna basın.
4. Program, kimlik numarasını analiz edip sonucu ekrana yazdıracaktır:
   - "Tutarlı" - Kimlik numarası doğrulama algoritmasına uygundur.
   - "Tutarsız" - Kimlik numarası doğrulama algoritmasına uygun değildir.

## Kod Açıklamaları
### Değişkenler
- **tckn**: Kullanıcıdan alınan 11 haneli kimlik numarası.
- **ilk9**: Kimlik numarasının ilk 9 hanesi.
- **son2**: Kimlik numarasının son iki hanesi.
- **tekler**: İlk 9 hanenin tek basamaklarının toplamı.
- **ciftler**: İlk 9 hanenin çift basamaklarının toplamı.
- **b10**: Kimlik numarasının 10. basamağının hesaplanan değeri.
- **b11**: Kimlik numarasının 11. basamağının hesaplanan değeri.

### Önemli Noktalar
- TCKN'nin yalnızca rakamlardan oluşması gerekir.
- Girilen değer tam olarak 11 hane olmalıdır, aksi takdirde işlem yapılmaz.
- Tek ve çift basamakların toplamları, bir **for döngüsü** ile hesaplanmaktadır.

## Örnek Çalıştırma
### Giriş:
```
Kimlik Giriniz:12345678910
```
### Çıkış:
```
Tutarsız.
```

### Giriş:
```
Kimlik Giriniz:12345678901
```
### Çıkış:
```
Tutarlı.
```

## Gereksinimler
- Java JDK 8 veya üstü

## Geliştirme
Eğer bu programı geliştirmek isterseniz:
1. TCKN doğrulama algoritması hakkında bilgi edinin.
2. Kod üzerinde düzenleme yaparak, ek özellikler ekleyebilirsiniz, örneğin:
   - Kullanıcıdan tekrar kimlik girmesini isteme.
   - Yanlış formatta kimlik girildiğinde uyarı mesajı ekleme.

## Lisans
Bu proje açık kaynaklıdır. Dilediğiniz gibi kullanabilir ve değiştirebilirsiniz.

