# CountryPhonePicker
This is a library to help all of projects can select with country phone very easy.
<table>
  <tr>
    <td width="480"><img src="http://i.imgur.com/Wa4seUg.png"/></td>
    <td width="480"><img src="http://i.imgur.com/33WWOph.png"/></td>
    <td width="480"><img src="http://i.imgur.com/tNIzl3L.png"/></td>
  </tr>
</table>

Status
======

- Current stable version: [ ![Download](https://api.bintray.com/packages/bonnguyen/maven/countryphonepicker/images/download.svg) ](https://bintray.com/bonnguyen/maven/camerafacedetection/_latestVersion)
- Current development version: n/a

Get It
===

- Maven repository: jCenter
- Group: com.github.bonnguyen
- Artifact ID: countryphonepicker

What's new (1.0.0)
==========
- Supported 241 countries
 
Installation
============

Release versions are available from jCenter repository, so just add the "compile..." statement to your project. For snapshots, please
add our bintray snapshots repository url first: https://dl.bintray.com/bonnguyen/maven

```groovy
repositories{
    maven {
        url 'https://dl.bintray.com/bonnguyen/maven'
    }
}
```
And put it in App dependencies:

```groovy
dependencies {
    ...
    compile 'com.github.bonnguyen:countryphonepicker:1.0.0'
    ...
}
```

Configuration and Start
=============


In <b>Java</b> code

```groovy

CountryPicker countryPicker = new CountryPicker();
countryPicker.show(getSupportFragmentManager(), CountryPicker.class.getSimpleName());
....

And get the result after selected:
```groovy
countryPicker.setListener(new CountryPicker.CountryPickerListener() {
                    @Override
                    public void onSelectCountry(DialogFragment dialog, String name, String phoneCode, String countryCode) {
                        dialog.dismiss();
                        tvCountryInfor.setText("Country " + name + " has country code phone: "
                                + phoneCode + " and country code: " + countryCode);
                    }
                });
```

Bugs, Suggestions, Ideas
========================
Any ideas/bugs/etc, as well as pull requests, are welcome in the [issues section](https://github.com/bonnguyen/CountryPhonePicker/issues).

DEVELOP BY
===================================
[Bon Nguyen](https://github.com/bonnguyen) - nguyennhatbon07t1@gmail.com

LICENSE
===================================
<br/>
The MIT License (MIT)

Copyright (c) 2016 Bon Nguyen.

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
<br/>       
