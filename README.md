# Compose Icon
![Compose Version](https://img.shields.io/badge/Compose-1.0.0--beta09-brightgreen)
![Maven Central](https://img.shields.io/maven-central/v/com.sinaukoding/composeicon/1.0.0)

An icon library for Jetpack Compose. 

![](https://i.ibb.co/M2H9qMv/Compose-Icon.png)

## About
This library still in work progress 🚧 you can contribute to this repository.

## Supported Icon
- Font Awesome  
- Foundation

## Installing
Add code below in  `app/build.gradle` then sync project
```gradle
dependencies {
  implementation "com.sinaukoding:composeicon:$version"
}
```

## Usage
To use this library, you can use a composable **ComposeIcon()** then you pass ComposeIcon collection (by type). 
```kotlin
// Font Awesome
ComposeIcon(icon = FaIcons.ChartBarRegular)

// Foundation
ComposeIcon(icon = Foundation.Person)
```
## License
```
THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
IN NO EVENT SHALL THE AUTHORS BE LIABLE FOR ANY CLAIM, DAMAGES OR
OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
OTHER DEALINGS IN THE SOFTWARE.

```