@echo off
echo ===================================================
echo   Habit Tracker - Android APK Build & Copy Script
echo ===================================================
echo.
echo [1/2] Compiling Android APK with compatible widget changes...
call .\android\gradlew.bat -p android assembleDebug
if %errorlevel% neq 0 (
    echo.
    echo [ERROR] Gradle compilation failed! Review error logs above.
    pause
    exit /b %errorlevel%
)
echo.
echo [2/2] Overwriting root Hab_debug.apk with the fresh build...
copy /y "android\app\build\outputs\apk\debug\app-debug.apk" "Hab_debug.apk"
echo.
echo ===================================================
echo   [SUCCESS] Fresh Hab_debug.apk built and copied!
echo ===================================================
echo.
pause
