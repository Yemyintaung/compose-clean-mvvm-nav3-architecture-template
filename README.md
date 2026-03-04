# compose-clean-mvvm-nav3-architecture-template
Android Studio Template for app development. Using Jetpack Compose, Clean Architecture, and MVVM with separated State/Action/Event. Fully optimized for Navigation 3 and Hilt in multi-module environments.

🚀 Installation & Usage

1. Installation
To use these templates in your project, you must manually add the .ft (File Template) files to your project's hidden IDE settings.

   1.1. Locate your project's .idea folder in your file explorer (Finder or Windows Explorer).
   
   1.2. Navigate to .idea/fileTemplates. If the fileTemplates folder doesn't exist, create it.
   
   1.3. Copy all .ft files from this repository's /templates folder into that directory.
   
   1.4. Restart Android Studio to refresh the project's internal template cache.

2. Basic Usage
   
    2.1. Once installed, the templates will appear in your standard "New" context menu.
    Right-click on the package/folder where you want to create a new feature (e.g., com.your.app.features.profile).
  
    2.2. Select New > MVVM Feature.
  
    2.3. In the dialog, enter the Feature Name (e.g., Profile).
  
    2.4. Click OK. Android Studio will instantly generate:
    * `ProfileScreen.kt` (Compose View)
    * `ProfileViewModel.kt` (Hilt-injected)
    * `ProfileState.kt`, `ProfileAction.kt`, `ProfileEvent.kt`
    * `navigation/ProfileEntry.kt` (Nav3 Provider)
   
4. Navigation 3 Integration
   
    This template is built for Navigation 3. To link your new feature to the app's main navigation:
    * In your :app or :navigation module, inject the EntryProviderScope.
    * Call the generated entry provider in your NavDisplay:
      
          NavDisplay(
              backstack = backstack,
              onBack = { backstack.removeLast() }
          ) {
              profileEntry()
              homeEntry()
          }

5. Required Dependencies
   
    Ensure your build.gradle.kts includes these libraries for the generated code to compile:

       dependencies {
   
         // Navigation 3
         implementation("androidx.navigation3:navigation3-runtime:1.0.1")
         implementation("androidx.navigation3:navigation3-ui:1.0.1")
   
         // Dagger Hilt
         implementation("com.google.dagger:hilt-android:2.51")
         kapt("com.google.dagger:hilt-compiler:2.51")
         implementation("androidx.hilt:hilt-navigation-compose:1.2.0")
   
       }
