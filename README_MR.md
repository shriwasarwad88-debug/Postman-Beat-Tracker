# Postman Beat Tracker – प्राथमिक Android प्रोजेक्ट

## महत्त्वाची नोंद
हा **प्राथमिक source-code नमुना** आहे. सध्याच्या आवृत्तीत GPS tracking, background location service, route history किंवा PDF/CSV रिपोर्ट कार्यरत नाहीत. स्क्रीनवरील START/PAUSE/STOP हे फक्त डेमो बटणे आहेत. त्यामुळे हा APK पोस्टमनच्या प्रत्यक्ष बीटचे अंतर मोजण्यासाठी अजून वापरू नका.

## GitHub वरून APK कसा तयार करायचा (मोबाईलवरून)
1. GitHub वर नवीन Public repository तयार करा.
2. या ZIP मधील सर्व फाईल्स आणि फोल्डर्स repository च्या root मध्ये upload करा.
3. `Actions` टॅब उघडा. Workflow सुरू झाल्यावर पूर्ण होईपर्यंत थांबा.
4. `Android Build` workflow मधील यशस्वी run उघडा.
5. `Artifacts` विभागातून `PostmanBeatTracker-debug` डाउनलोड करा.
6. ZIP extract करून `app-debug.apk` Android फोनमध्ये install करा.

## पुढील विकास
- GPS permission आणि foreground location service
- GPS accuracy / jump filtering आणि distance calculation
- Daily route history (local database)
- PDF / CSV export
- मराठी / हिंदी / English
- Privacy notice आणि user-controlled location tracking
